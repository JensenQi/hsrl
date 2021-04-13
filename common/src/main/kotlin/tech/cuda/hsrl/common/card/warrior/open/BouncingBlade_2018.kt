package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BouncingBlade_2018 : Card() {
    override val id = 2018
    override val name = "弹射之刃"
    override val description = "随机对一个随从造成 1点伤害。重复此效果，直到某个随从死亡。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Gvg
    override val background = "只有地精曾经认为这是一项很棒的发明；而现在，连他们也开始有点怀疑了。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b998299a25c8b455bd3e898e5484e764a28924559d8e4533b160c802cdfb59fc.png"
}
