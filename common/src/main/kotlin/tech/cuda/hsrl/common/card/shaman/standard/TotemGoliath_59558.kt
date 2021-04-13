package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TotemGoliath_59558 : Card() {
    override val id = 59558
    override val name = "图腾巨怪"
    override val description = "<b>亡语：</b>召唤全部四种基础图腾。 <b>过载：</b>（1）"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "这原本是个美术项目，没人知道它的终点在哪。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e7ad82bc69873bd4f91d9872fe73d0acc37100c1c74e042660636d9d8725fb9e.png"
}
