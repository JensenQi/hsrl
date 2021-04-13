package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScrapyardColossus_56819 : Card() {
    override val id = 56819
    override val name = "废料场巨像"
    override val description = "<b>嘲讽，亡语：</b>召唤一个7/7并具有<b>嘲讽</b>的邪爆巨像。"
    override var cost: Int? = 10
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "不积废料，无以成邪爆。"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a5a07648e760c726b933b788ccfbdecf89dfc9a12c15ca0e4ad0c8b11213de3b.png"
}
