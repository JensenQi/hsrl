package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StrongshellScavenger_43022 : Card() {
    override val id = 43022
    override val name = "硬壳清道夫"
    override val description = "<b>战吼：</b>使你具有<b>嘲讽</b>的随从获得+2/+2。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Kotf
    override val background = "这不是盗墓，我只是在……清理墓地。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa81aa57272206f05b8f0ac54dd07182a3273fe425b1aa8868531be19a998fe2.png"
}
