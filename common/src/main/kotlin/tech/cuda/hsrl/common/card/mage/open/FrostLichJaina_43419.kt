package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostLichJaina_43419 : Card() {
    override val id = 43419
    override val name = "冰霜女巫吉安娜"
    override val description = "<b>战吼：</b>召唤一个3/6的水元素。在本局对战中，你的所有元素具有<b>吸血</b>。"
    override var cost: Int? = 9
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Kotf
    override val background = "“年轻的阿尔萨斯是个被宠坏的孩子，玩弄着他既不能控制、也不甚了解的力量。过来，不要害怕寒冷。我让你见识一下冰封王座的真正力量。”"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/625bac3c097ce3f5ef1a0cebc4bb020305d514bccde8eccd9a9c343a1cd46795.png"
}
