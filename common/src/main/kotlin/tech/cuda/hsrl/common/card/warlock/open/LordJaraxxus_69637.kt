package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LordJaraxxus_69637 : Card() {
    override val id = 69637
    override val name = "加拉克苏斯大王"
    override val description = "<b>战吼：</b>装备一把3/8的血怒。"
    override var cost: Int? = 9
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "“渺小的侏儒！你的傲慢会招致灭亡！”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7008757b59514cca43ba85c449e94d86f5d9350970f5723d237926a47a2532fc.png"
}
