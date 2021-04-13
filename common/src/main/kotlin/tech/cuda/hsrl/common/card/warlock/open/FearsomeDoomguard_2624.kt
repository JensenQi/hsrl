package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FearsomeDoomguard_2624 : Card() {
    override val id = 2624
    override val name = "恐怖末日守卫"
    override val description = ""
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Tgt
    override val background = "恐怖都写在名字里了，还能有比这更恐怖的家伙吗？"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f7ba29b8ff8b1fe0aa1dfcc949df0fa489a49dc2a8e59baab3be5d6eeab65cac.png"
}
