package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AuchenaiSoulpriest_237 : Card() {
    override val id = 237
    override val name = "奥金尼灵魂祭司"
    override val description = "你的恢复生命值的牌和技能改为造成等量的伤害。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy4
    override val background = "奥金尼的人们知道末日即将来临，只是不确定它到来的时间。"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e3fe4a6404dd800f704c4425b56c6ad37fac707c19c59ae8b9167e1316d5458.png"
}
