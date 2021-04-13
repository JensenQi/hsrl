package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShieldSlam_69641 : Card() {
    override val id = 69641
    override val name = "盾牌猛击"
    override val description = "你每有1点护甲值，便对一个随从造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "“什么是更好的武器？是敌人预料之中的利斧，还是敌人意想不到的钝刀？”——《战士的艺术》，第9章"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bd6a59b1f0280b83beb7f51308cf9c290fe65c6a42c5903a7e95f5dc1a26337d.png"
}
