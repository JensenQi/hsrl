package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Deathlord_1790 : Card() {
    override val id = 1790
    override val name = "死亡领主"
    override val description = "<b>嘲讽，亡语：</b>你的对手将一个随从从其牌库置入战场。"
    override var cost: Int? = 3
    override var health: Int? = 8
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "“从你的坟墓中醒来吧！”——克尔苏加德"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/02adca713bc0b959d335f3afb9144bbfbe22a7b4bbfa852675e34bb50a523b09.png"
}
