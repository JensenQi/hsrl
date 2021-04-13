package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GhostLightAngler_47600 : Card() {
    override val id = 47600
    override val name = "冥光鱼人"
    override val description = "<b>回响</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.TheWitchwood
    override val background = "<鱼人语>BoOooOogrglgrlgrlooOoOoo!"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e28541ff377d9a0b3a254d6500e79e2ace3cecbf3b877c405b966568daf6bc95.png"
}
