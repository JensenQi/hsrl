package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShallowGravedigger_42785 : Card() {
    override val id = 42785
    override val name = "孱弱的掘墓者"
    override val description = "<b>亡语：</b>随机将一个具有<b>亡语</b>的随从置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "你自己海拔只有三尺高，很难挖地六尺埋葬他们。"
    override val artist = "Izzy Hoover"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a289a9b233aaa5501225e296f37881035d0d49bf5ea6cbe1da135178f2bdaf6.png"
}
