package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FieldContact_62888 : Card() {
    override val id = 62888
    override val name = "原野联络人"
    override val description = "在你使用一张<b>战吼</b>牌或<b>连击</b>牌后，抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "那叫什么刀……这才叫刀！"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9455400d5b944bf5adb115e1664245493466f1ac3a446fdf919052b55fb55700.png"
}
