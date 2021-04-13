package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SplittingFesteroot_47292 : Card() {
    override val id = 47292
    override val name = "分裂腐树"
    override val description = "<b>亡语：</b>召唤两个2/2的分裂树苗。"
    override var cost: Int? = 8
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "树之将腐，哭也没用。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/192c1bc796cc37d08f1375bf76174e65c9ee4577b3fe83374aec8c34be0676ae.png"
}
