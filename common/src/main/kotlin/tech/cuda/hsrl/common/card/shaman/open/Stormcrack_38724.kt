package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stormcrack_38724 : Card() {
    override val id = 38724
    override val name = "雷暴术"
    override val description = "对一个随从造成 4点伤害，<b>过载：</b>（1）"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Wotog
    override val background = "被雷劈是什么滋味……恐怕没多少亲历者能活着告诉你。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/692bc4209629fc2611a2e873457c7cfe386e470405491e0653bc90783b8ebf54.png"
}
