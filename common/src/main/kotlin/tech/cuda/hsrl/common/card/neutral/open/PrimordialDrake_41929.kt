package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrimordialDrake_41929 : Card() {
    override val id = 41929
    override val name = "始生幼龙"
    override val description = "<b>嘲讽，战吼：</b> 对所有其他随从造成2点伤害。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "它的一副公鸭嗓让自己在族群里独树一帜。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/da943edea72d629bdeb704f7628750c9c15e1ac188706dac4a97f686452fa32d.png"
}
