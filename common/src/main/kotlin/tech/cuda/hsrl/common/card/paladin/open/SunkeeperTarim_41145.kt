package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SunkeeperTarim_41145 : Card() {
    override val id = 41145
    override val name = "守日者塔林姆"
    override val description = "<b>嘲讽，战吼：</b>将所有其他随从的攻击力和生命值变为3。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Ungoro
    override val background = "其实他最喜欢的数字是4，只可惜…"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fff335fc234de183e179012f61d717c6eca47ff9f5d8d8cc9c539226e570f0ec.png"
}
