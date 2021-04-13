package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LordJaraxxus_777 : Card() {
    override val id = 777
    override val name = "加拉克苏斯大王"
    override val description = "<b>战吼：</b>装备一把3/8的血怒。"
    override var cost: Int? = 9
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "“渺小的侏儒！你的傲慢会招致灭亡！”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cbdd20eeea0d38a321d2f24a32afdc8fe3d94b91d58565c791ff6792104daed6.png"
}
