package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ViciousScalehide_46710 : Card() {
    override val id = 46710
    override val name = "凶恶的鳞皮兽"
    override val description = "<b>吸血</b>，<b>突袭</b>"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "如果你不在意流点血的话，它们其实是很好的宠物。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/94294d6533bbdb4ac73efd0bbfc3f96a456c3579d58e4142c0a3f84624ee5e13.png"
}
