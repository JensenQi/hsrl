package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GennGreymane_47693 : Card() {
    override val id = 47693
    override val name = "吉恩·格雷迈恩"
    override val description = "<b>对战开始时：</b>如果你的套牌中只有法力值消耗为偶数的牌，你的初始英雄技能的法力值消耗变为（1）点。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "“希尔瓦娜斯杀了偶的儿子，偶一定要为他报仇！”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d16b1b7e66d386bdef84d043b104610c285beb6bf154280da30515537a5d948c.png"
}
