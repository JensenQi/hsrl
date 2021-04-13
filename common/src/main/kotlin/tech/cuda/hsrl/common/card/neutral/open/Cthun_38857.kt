package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cthun_38857 : Card() {
    override val id = 38857
    override val name = "克苏恩"
    override val description = "<b>战吼：</b> 造成等同于该随从攻击力的伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 10
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "克苏恩最讨厌的一张牌，就是圣骑士的奥秘“以眼还眼”。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ceb60feae53254291c25ef7544c11bc15eca32cfa59229fcb71144d8c38fb015.png"
}
