package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Loatheb_1914 : Card() {
    override val id = 1914
    override val name = "洛欧塞布"
    override val description = "<b>战吼：</b>下个回合敌方法术的法力值消耗增加（5）点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "洛欧塞布原本只是头普通的沼泽兽。从它身上的变化可见矿业和农业给自然带来了多大的破坏。"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/11f8428fe8444b26956fb9e5dbc508f54774f8f379969b945e7486d17504fb92.png"
}
