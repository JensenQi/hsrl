package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KoboldStickyfinger_55432 : Card() {
    override val id = 55432
    override val name = "黏指狗头人"
    override val description = "<b>战吼：</b> 偷取对手的武器。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "他不要蜡烛。他只想宝剑。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/578d49c0d5c42f283185e670257f5a9bf61199084ee1e06dbf4abd86827f30c7.png"
}
