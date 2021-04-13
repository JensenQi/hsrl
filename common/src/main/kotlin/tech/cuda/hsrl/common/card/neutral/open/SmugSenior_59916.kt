package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SmugSenior_59916 : Card() {
    override val id = 59916
    override val name = "浮夸的大四学长"
    override val description = "<b>嘲讽，亡语：</b>将一个5/7并具有<b>嘲讽</b>的幽灵置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "今日浮夸何足道？但看毕业五年期。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68795e473d49e4d8c5d71f0c692a2a51785d7fa352f381efe5db01b17d7f65bd.png"
}
