package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwordAndBoard_57718 : Card() {
    override val id = 57718
    override val name = "剑盾猛攻"
    override val description = "对一个随从造成 2点伤害。获得2点护甲值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.AshesOfOutland
    override val background = "为什么我的爆壳猛猪不能超极巨化？"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f144f074e20f13a6cbd164dcc5c090995e0deef9d1334c02f7789b165d02e808.png"
}
