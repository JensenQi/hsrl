package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrakkariTrickster_50414 : Card() {
    override val id = 50414
    override val name = "达卡莱幻术师"
    override val description = "<b>战吼：</b>使双方玩家各随机获得一张对方牌库中的卡牌的复制。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "这是<i>幻象</i>，玛拉卡斯！你在掩饰什么？"
    override val artist = "Cicily He"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d6650fd20ecd7a00f4de8d59915888d1bc7e5e79ecde51b4e00fe41e1e7b8e59.png"
}
