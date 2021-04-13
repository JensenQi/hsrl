package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HackTheSystem_54391 : Card() {
    override val id = 54391
    override val name = "侵入系统"
    override val description = "<b>任务：</b>用你的英雄攻击5次。<b>奖励：</b>安拉斐特之核。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "一切皆可破解，软的不行就来硬的。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84ad7c06ccd67134bdd2e758d8c614c9b87383017414ad29b30c79fa410029f7.png"
}
