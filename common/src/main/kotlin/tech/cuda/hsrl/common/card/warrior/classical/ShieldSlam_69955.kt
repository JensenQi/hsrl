package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShieldSlam_69955 : Card() {
    override val id = 69955
    override val name = "盾牌猛击"
    override val description = "你每有1点护甲值，便对一个随从造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "“什么是更好的武器？是敌人预料之中的利斧，还是敌人意想不到的钝刀？”——《战士的艺术》，第9章"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a58d28286cb142aab234223e849f3b240f0d27ced8089d691270aee39ea70ad7.png"
}
