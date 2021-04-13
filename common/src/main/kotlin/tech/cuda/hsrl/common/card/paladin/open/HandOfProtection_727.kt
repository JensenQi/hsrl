package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HandOfProtection_727 : Card() {
    override val id = 727
    override val name = "保护之手"
    override val description = "使一个随从获得<b>圣盾</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy1635
    override val background = "这个法术的名字已经被修改了太多次，导致连圣骑士们都不知道它应该叫什么了。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f541ef2a2899c6c1d7a9b1059a3e4d896934e7463583cd2091a75efef1e6d93a.png"
}
