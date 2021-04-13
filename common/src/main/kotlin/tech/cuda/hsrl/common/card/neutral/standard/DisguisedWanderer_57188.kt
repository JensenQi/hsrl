package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DisguisedWanderer_57188 : Card() {
    override val id = 57188
    override val name = "变装游荡者"
    override val description = "<b>亡语：</b>召唤一个9/1的审判官。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "向东流浪……一直向东去。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5000b8c3aca802780e23bbb97a32acbc2ebb799aa2342d21977daa8938b29f90.png"
}
