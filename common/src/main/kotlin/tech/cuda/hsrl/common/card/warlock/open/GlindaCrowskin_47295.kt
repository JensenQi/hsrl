package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GlindaCrowskin_47295 : Card() {
    override val id = 47295
    override val name = "格林达·鸦羽"
    override val description = "你手牌中的所有随从牌获得<b>回响</b>。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.TheWitchwood
    override val background = "终于可以无限次召唤……小精灵啦。"
    override val artist = "Jomaro Kindred"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/beecc9e4a7dd16414453114ccbb45403380ce7ffac2c0ccb6591dde409f75a3a.png"
}
