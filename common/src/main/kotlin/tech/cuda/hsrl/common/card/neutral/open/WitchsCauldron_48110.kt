package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WitchsCauldron_48110 : Card() {
    override val id = 48110
    override val name = "女巫的坩埚"
    override val description = "在一个友方随从死亡后，随机将一张萨满祭司法术牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "鱼眼泡，蝙蝠耳，蛤蟆腿，牛油，花椒，桂皮……"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/276e48d81f50fb784bde9f313148e25ab64cf3385815777089d3ea7de46b9949.png"
}
