package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FairgroundFool_61268 : Card() {
    override val id = 61268
    override val name = "游乐园小丑"
    override val description = "<b>嘲讽，腐蚀：</b>获得+4生命值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“在暗月竞速赛中，伊利丹开进了死胡同，你猜他会说什么？‘真是自寻死路！’”"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2650445f234bdb00c4189644b4ead700df374676060af229f4b660c7d9077553.png"
}
