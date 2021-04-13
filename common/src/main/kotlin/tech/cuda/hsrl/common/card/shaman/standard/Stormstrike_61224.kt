package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stormstrike_61224 : Card() {
    override val id = 61224
    override val name = "风暴打击"
    override val description = "对一个随从造成 3点伤害。在本回合中，使你的英雄获得+3攻击力。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "手机电量只剩5%时的你。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7d93094b1842fda302ce37705697011de2a8fba52936c3782c5e3333005ccf0c.png"
}
