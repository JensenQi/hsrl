package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShieldSlam_546 : Card() {
    override val id = 546
    override val name = "盾牌猛击"
    override val description = "你每有1点护甲值，便对一个随从造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy3
    override val background = "“什么是更好的武器？是敌人预料之中的利斧，还是敌人意想不到的钝刀？”——《战士的艺术》，第9章"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/87374b04623cb2349d8e854b22f418a509b749861bcec4eefcd5eae488955c4f.png"
}
