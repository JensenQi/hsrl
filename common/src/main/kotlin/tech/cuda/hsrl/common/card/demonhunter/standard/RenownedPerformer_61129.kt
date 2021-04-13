package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RenownedPerformer_61129 : Card() {
    override val id = 61129
    override val name = "知名表演者"
    override val description = "<b>突袭，亡语：</b>召唤两个1/1并具有<b>嘲讽</b> 的助演。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "把助手切成两段是整场表演中最简单的一段。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6eecc3cc3dfae95cf53de5ad0883c9afa09d3ae586b4078810ce308f98d57eec.png"
}
