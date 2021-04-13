package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NoviceEngineer_284 : Card() {
    override val id = 284
    override val name = "工程师学徒"
    override val description = "<b>战吼：</b>抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "“班里的一半学生无法毕业...因为他们会被变成小鸡。”——工匠大师欧沃斯巴克，授课于齿轮101班"
    override val artist = "Karl Richardson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8a3b248cbde047e224a28ec3993861fb0eb547a289e4bda4b98d42080aca7ae7.png"
}
