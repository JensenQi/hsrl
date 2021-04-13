package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowMadness_69927 : Card() {
    override val id = 69927
    override val name = "暗影狂乱"
    override val description = "直到回合结束，获得一个攻击力小于或等于3的敌方随从的控制权。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "随你如何让它恢复理智，这个过程本身仍是件卑劣的事。"
    override val artist = "Mark Gibbons"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/88dfc5ef55903904ed7c45782cecc6b91891970a6e9495998807561791932a2c.png"
}
