package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrinceValanar_45342 : Card() {
    override val id = 45342
    override val name = "瓦拉纳王子"
    override val description = "<b>战吼：</b>如果你的牌库里没有法力值消耗为（4）的牌，则获得<b>吸血</b>和<b>嘲讽</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "三个王子站在一起，一个想要吃掉兄弟。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/637e80415fe49a5c0aea24793953fb735396eba9c8b669f28248f0bfa40766fe.png"
}
