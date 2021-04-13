package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GroveTender_2225 : Card() {
    override val id = 2225
    override val name = "林地树妖"
    override val description = "<b>抉择：</b>使每个玩家获得一个法力水晶；或每个玩家抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Gvg
    override val background = "喜好：徒步旅行，拥抱美丽的大自然。厌恶：地精伐木机和拖鞋。（讨厌拖鞋纯粹是因为找不到合脚的。）"
    override val artist = "Chris Rahn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/df6487c04c458d04ce41648d744d288c402258a36496e64cb34c66dd8feddd18.png"
}
