package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodToIchor_38918 : Card() {
    override val id = 38918
    override val name = "化血为脓"
    override val description = "对一个随从造成 1点伤害，如果它依然存活，则召唤一个2/2的泥浆怪。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Wotog
    override val background = "第二招叫化脓为血，将之前的过程反向来一遍，受害者多半是被恶心死的……"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a3dba7366823781ecf62adf5e77106b2528e680f7d11a8afe5d3289c466e7cd6.png"
}
