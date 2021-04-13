package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OccultConjurer_61584 : Card() {
    override val id = 61584
    override val name = "隐秘咒术师"
    override val description = "<b>战吼：</b>如果你控制一个<b>奥秘</b>，便召唤一个该随从的复制。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "本体和镜像体很像，但更神秘，也更焦虑。"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/919e0b621fc7b448b006f8442f09d85c89ed0fd95e242646365a20293a7184f3.png"
}
