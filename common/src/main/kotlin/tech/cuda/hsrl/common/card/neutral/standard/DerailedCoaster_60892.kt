package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DerailedCoaster_60892 : Card() {
    override val id = 60892
    override val name = "脱轨过山车"
    override val description = "<b>战吼：</b>你的手牌中每有一张随从牌，召唤一个1/1并具有<b>突袭</b>的乘客。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "只要乘客还没死，所有的意外就都算是乘坐“体验”的一部分。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7c75e88b1c6c5f6fc76634781b267dfb183346e89ce20a8cb08f83320caad941.png"
}
