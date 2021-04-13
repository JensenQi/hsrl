package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SquirmingTentacle_39003 : Card() {
    override val id = 39003
    override val name = "裂地触须"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "农夫们对裂地触须真是又爱又恨，要是它们能在开垦土地时不破坏房屋就好了。"
    override val artist = "L. Lullabi & Nutchapol "
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e26cf1eb741662795f98a58ca99a266d30b5f36a8e20759609373c5def4c55db.png"
}
