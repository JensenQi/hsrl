package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MekgineerThermaplugg_2084 : Card() {
    override val id = 2084
    override val name = "瑟玛普拉格"
    override val description = "每当一个敌方随从死亡，召唤一个 麻风侏儒。"
    override var cost: Int? = 9
    override var health: Int? = 7
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "过去他非常执迷于炸药。而现在他更加关怀麻风侏儒们的生计，因为他们能够造成更稳定的伤害。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4dfe57c014c2514928b1537e7f964dbe5b870aac581ee5d532723eb88c6f9be1.png"
}
