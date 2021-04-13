package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowStrike_38578 : Card() {
    override val id = 38578
    override val name = "暗影打击"
    override val description = "对一个 未受伤的角色造成 5点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Wotog
    override val background = "这招有点像背刺。区别在于暗影打击是迎着面来的，而且比背刺更疼。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/786f44b8a2ecbf6bc18ab9ca9928a5f36640b0196d25e9344a883a8dd7007ac9.png"
}
