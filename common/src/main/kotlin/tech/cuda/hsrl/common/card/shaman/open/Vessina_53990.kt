package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Vessina_53990 : Card() {
    override val id = 53990
    override val name = "维西纳"
    override val description = "当你<b>过载</b>时，你的所有其他随从获得+2攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "在哈加莎把她派回奥丹姆的时候，她其实很生气。但她表达“生气”和“愿意”时的嘶嘶声实在是太像了，谁也没听出其中的区别。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a46af79631969241205520b552629a8c169d9a992d8237cc9b74ff0d24f41e6.png"
}
