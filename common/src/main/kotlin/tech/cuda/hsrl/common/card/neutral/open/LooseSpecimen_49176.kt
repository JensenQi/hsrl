package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LooseSpecimen_49176 : Card() {
    override val id = 49176
    override val name = "脱逃的样本"
    override val description = "<b>战吼：</b>造成6点伤害，随机分配到所有其他友方随从身上。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "看看，这就是把死亡猎手雷克萨留在实验室的后果。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cf3f197a1b190ee717693037ed1c4aa839dde9ca2a882a1ad3c783fe26681043.png"
}
