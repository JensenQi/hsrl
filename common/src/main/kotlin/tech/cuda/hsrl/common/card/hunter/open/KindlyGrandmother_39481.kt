package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KindlyGrandmother_39481 : Card() {
    override val id = 39481
    override val name = "慈祥的外婆"
    override val description = "<b>亡语：</b>召唤一只3/2的大灰狼。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Karazhan
    override val background = "当这位“外婆”亮出她的尖牙和利爪时，就显得不那么慈祥了。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/105b62425ad28c749da0fc995771ae3112fce9c41ce6c009f11dbdf12cb60e4c.png"
}
