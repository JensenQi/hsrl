package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FirePlumesHeart_41427 : Card() {
    override val id = 41427
    override val name = "火羽之心"
    override val description = "<b>任务：</b>使用七张具有<b>嘲讽</b>的随从牌。 <b>奖励：</b>萨弗拉斯。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Ungoro
    override val background = "是的，只要把这枚戒指丢下去，你的任务就完成了…很简单吧。"
    override val artist = "Nate Bowden"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a351bb9e5ad4ae07a569f1c48bdac0e38da5c548c21c04d4ae7271736d6cab0.png"
}
