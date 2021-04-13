package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AuchenaiSoulpriest_70039 : Card() {
    override val id = 70039
    override val name = "奥金尼灵魂祭司"
    override val description = "你的恢复生命值的牌和技能改为造成等量的伤害。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "奥金尼的人们知道末日即将来临，只是不确定它到来的时间。"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/00b02fe7af699064536890fa2743b463bc3d59593f4d47231fd746f5aed1029e.png"
}
