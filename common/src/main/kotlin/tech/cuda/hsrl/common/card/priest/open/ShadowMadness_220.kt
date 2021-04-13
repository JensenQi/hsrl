package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowMadness_220 : Card() {
    override val id = 220
    override val name = "暗影狂乱"
    override val description = "直到回合结束，获得一个攻击力小于或等于3的敌方随从的控制权。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "随你如何让它恢复理智，这个过程本身仍是件卑劣的事。"
    override val artist = "Mark Gibbons"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f8714af16139a2fa5dee75c96becc5664349efa36198b50eaec161bc619c66a7.png"
}
