package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ursatron_52790 : Card() {
    override val id = 52790
    override val name = "机械巨熊"
    override val description = "<b>亡语：</b>从你的牌库中抽一张机械牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RiseOfShadows
    override val background = "内置程序包含全套儿童歌曲。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b166561270e6d06934a070abc3f129654592ce450b8d25e9a7a7d382fdc4bafc.png"
}
