package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HandOfProtection_68464 : Card() {
    override val id = 68464
    override val name = "保护之手"
    override val description = "使一个随从获得<b>圣盾</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "这个法术的名字已经被修改了太多次，导致连圣骑士们都不知道它应该叫什么了。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/becfd7ae59427e766953491e668c49394c16e602423215d6ffa38e7e47e90e69.png"
}
