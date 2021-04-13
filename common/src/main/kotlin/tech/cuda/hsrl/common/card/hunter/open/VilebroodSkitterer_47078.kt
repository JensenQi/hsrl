package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VilebroodSkitterer_47078 : Card() {
    override val id = 47078
    override val name = "邪巢诱捕蛛"
    override val description = "<b>剧毒，突袭</b>"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.TheWitchwood
    override val background = "它本有志成为邪巢舞者的，无奈八条腿总踩到别人脚。"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c1dda50976c7a9231207b4567b414b4b910d219de7b621a6aa6c09fa41a949e2.png"
}
